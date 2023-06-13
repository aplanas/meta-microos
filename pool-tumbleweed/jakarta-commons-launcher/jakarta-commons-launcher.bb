SUMMARY = "A Cross-Platform Java Application Launcher"
DESCRIPTION = "Commons-launcher eliminates the need for a batch or shell script to \
launch a Java class. Some situations where elimination of a batch or \
shell script may be desirable are: \
 \
* You want to avoid having to determining where certain application \
   paths are, for example, your application's home directory. \
   Determining this dynamically in a Windows batch script is very \
   tricky on some versions of Windows or when softlinks are used on \
   Unix platforms. \
 \
* You want to avoid having to handle native file and path separators \
   or native path quoting issues. \
 \
* You need to enforce certain system properties, such as \
   java.endorsed.dirs when running with JDK 1.4. \
 \
* You want to allow users to pass custom JVM arguments or system \
   properties without having to parse and reorder arguments in your \
   script. This can be tricky or messy in batch and shell scripts. \
 \
* You want to bootstrap system properties from a configuration file \
   instead of hard-coding them in your batch and shell scripts. \
 \
* You want to provide localized error messages, which is very tricky to \
   do in batch and shell scripts."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "jakarta-commons-launcher-1.1-25.6.noarch.rpm"
RPM_HASH = "7c3feef04ebf07b36d0c7b9e5dec327c4df0fa05bf6d520486e98e4cdf0503ea154a4b79e33454c4563cfdad12ae11869b8d772afcd8fe1f41f6e168ca3c02cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-launcher"

RDEPENDS:${PN} += ""

inherit rpm
