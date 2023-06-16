SUMMARY = "Java API for handling Windows ini file format"
DESCRIPTION = "The [ini4j] is a simple Java API for handling configuration files in \
Windows .ini format. Additionally, the library includes Java \
Preferences API implementation based on the .ini file."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "ini4j-javadoc-0.5.1-28.9.noarch.rpm"
RPM_HASH = "fb29e111147d67443f0dfda7ae03a4bf6361d68ead2342c1e2c98b6fc87965250c9828aa10c748bf1092d1d5d0ecc4ad5a871d03d2d1be2a5d5f22bde8cdde06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ini4j-javadoc"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/rm \
javapackages-filesystem"

inherit rpm
