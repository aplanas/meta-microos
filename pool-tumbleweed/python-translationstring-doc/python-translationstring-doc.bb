SUMMARY = "Documentation files for python-translationstring"
DESCRIPTION = "This package contains documentation files for python-translationstring."
LICENSE = "SUSE-Repoze"

PV = "1.4"

RPM_NAME = "python-translationstring-doc-1.4-3.3.noarch.rpm"
RPM_HASH = "e20d33d9dbcc9804b74289fd255060c31003a606c2f2dd10ad29959793b4b2a5271cf2ed7578c6a6db7298c87c44bf688893447e4337f9ebfeefb184cb3413c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-translationstring-doc \
python310-translationstring-doc \
python311-translationstring-doc \
python39-translationstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
