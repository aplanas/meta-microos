SUMMARY = "Documentation files for python-translationstring"
DESCRIPTION = "This package contains documentation files for python-translationstring."
LICENSE = "SUSE-Repoze"

PV = "1.4"

RPM_NAME = "python-translationstring-doc-1.4-2.12.noarch.rpm"
RPM_HASH = "48802a00d1dc8e85209c6ff53a23672c87ac3ca653c8c123812f1aa7ec2ba09d5a471ae56123f3d75ca26750e515a32abeb728da5b16d748e3a12cf10279cf00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-translationstring-doc \
python310-translationstring-doc \
python311-translationstring-doc \
python39-translationstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
