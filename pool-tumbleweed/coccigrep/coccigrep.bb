SUMMARY = "Semantic grep tool for C, based on coccinelle"
DESCRIPTION = "coccigrep is a semantic grep for the C language based on coccinelle. It can be \
used to find where a given structure is used in code files. coccigrep depends on \
the spatch program which comes with coccinelle."
LICENSE = "GPL-3.0-only"

PV = "1.20"

RPM_NAME = "coccigrep-1.20-4.2.noarch.rpm"
RPM_HASH = "4f3869f6de1f1cfe48b1492f2ba7c5ef8596b2e5795ebf3d80bfadb44db32bf3341af088f8c182d30c8b84443560bbcc02091f2e2f37643c9b1682b0c2cd398a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coccigrep \
python3.11dist-coccigrep \
python3dist-coccigrep"

RDEPENDS:${PN} += "/usr/bin/python3 \
coccinelle \
python-abi \
python3"

inherit rpm
