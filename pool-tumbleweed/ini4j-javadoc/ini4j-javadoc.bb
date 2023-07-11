SUMMARY = "Java API for handling Windows ini file format"
DESCRIPTION = "The [ini4j] is a simple Java API for handling configuration files in \
Windows .ini format. Additionally, the library includes Java \
Preferences API implementation based on the .ini file."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "ini4j-javadoc-0.5.1-28.10.noarch.rpm"
RPM_HASH = "3772a98e8583d0816d6d7b853bd29ba0d20a76be511d58c82fc1d6d8885605156e4eb15c9618dbd2d4e0e97d4aa95ab19d8b08835e0b1a2d7612fd9e54a92ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ini4j-javadoc"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/rm \
javapackages-filesystem"

inherit rpm
