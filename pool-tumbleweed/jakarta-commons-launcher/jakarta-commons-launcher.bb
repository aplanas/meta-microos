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

RPM_NAME = "jakarta-commons-launcher-1.1-25.7.noarch.rpm"
RPM_HASH = "5b426d88ccd75d6141f392f8dc8a4d1d0b6b2f0e2c2b8db4085b74dd3771b9b9fc259ef98995803301dd3ef13287833389f88f55bf3c0fb54dac3be74fb4c709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-launcher"

RDEPENDS:${PN} += ""

inherit rpm
