SUMMARY = "Guess file type"
DESCRIPTION = "checktype_filename(), checktype_filehandle() and checktype_contents returns \
string contains file type with MIME mediatype format."
LICENSE = "Apache-1.0"

PV = "1.30"

RPM_NAME = "perl-File-MMagic-1.30-5.27.noarch.rpm"
RPM_HASH = "1394cf5108c997cf1635b71f9597271e2af9ab790f9a16eea8109cc231d3f6328dd29556140c48bf5ba44bf99d7023e78e12933ff6a7bc4996f4525b61715f8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--MMagic \
perl-File-MMagic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
