SUMMARY = "A YAML processor based on Syck"
DESCRIPTION = "Yecht is a Syck port, a YAML 1.0 processor for Ruby."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "yecht-1.1-1.19.noarch.rpm"
RPM_HASH = "afc699c799da543f2b8d8fba20b6ad14d2f5be7bb6e26fbbbff9abdcefaea48a262ab7e40b8a7aa937dbec751ddd44273ca30d4ba91170e54dd37c0e324caa28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jruby-yecht \
mvn-org.jruby-yecht--jruby- \
mvn-org.jruby-yecht-pom- \
mvn-org.jruby-yecht-pom-jruby- \
yecht"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
