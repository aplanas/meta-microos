SUMMARY = "Retrying library for Python"
DESCRIPTION = "Retrying is a general-purpose retrying library, written in Python, to \
simplify the task of adding retry behavior to just about anything."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "python311-retrying-1.3.4-1.5.noarch.rpm"
RPM_HASH = "1281181c4cc84f7aa81a0d1c0d1b85f8054758d147a44c2723444e1c6239b8b6a3e63aa30780167119c00f784d5b0c8e321a0e3f450a8f5afbc8a19f47002119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retrying \
python3.11dist-retrying \
python311-retrying \
python3dist-retrying"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
