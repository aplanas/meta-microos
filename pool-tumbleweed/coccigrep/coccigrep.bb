SUMMARY = "Semantic grep tool for C, based on coccinelle"
DESCRIPTION = "coccigrep is a semantic grep for the C language based on coccinelle. It can be \
used to find where a given structure is used in code files. coccigrep depends on \
the spatch program which comes with coccinelle."
LICENSE = "GPL-3.0-only"

PV = "1.20"

RPM_NAME = "coccigrep-1.20-4.1.noarch.rpm"
RPM_HASH = "b17d5133c934035161dd57a5239835b6cccd73001e3963106ed68795cc0a0188284174073e5b94aef725342c566819c426e5734c15412c313676ccb92137764c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coccigrep \
python3.10dist-coccigrep \
python3dist-coccigrep"

RDEPENDS:${PN} += "/usr/bin/python3 \
coccinelle \
python-abi \
python3"

inherit rpm
