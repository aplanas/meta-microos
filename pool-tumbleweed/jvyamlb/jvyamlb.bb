SUMMARY = "YAML processor for JRuby"
DESCRIPTION = "YAML processor extracted from JRuby."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "jvyamlb-0.2.5-20.7.noarch.rpm"
RPM_HASH = "f11040d494a5f8033ef62b0252d1368cded365a38c742858e9cc86ba19eadd3f7d0e86c56e4ed69b59ff0a4e630c35838a9eff554148ef7a100d18be4ab30036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jvyamlb"

RDEPENDS:${PN} += "bytelist \
java \
javapackages-tools \
jcodings \
joda-time"

inherit rpm
