SUMMARY = "Documentation of the Calligra Suite"
DESCRIPTION = "Documentation of the Calligra Office Suite applications."
LICENSE = "GFDL-1.2-only"

PV = "3.2.1"

RPM_NAME = "calligra-doc-3.2.1-7.16.noarch.rpm"
RPM_HASH = "ba9d68cea1ad549a96dba953785c805da505a089fb45297332e49f873228e240ae26c8e4c939c827bc99cb3b5f79e1ce17cb993760e12664792a662f0e6294ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calligra-doc"
RDEPENDS:${PN} += "calligra"

inherit rpm
