SUMMARY = "A collection of classes implementing the pen protocol for manipulating glyphs"
DESCRIPTION = "A collection of classes implementing the pen protocol for manipulating glyphs."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python311-fontPens-0.2.4-5.9.noarch.rpm"
RPM_HASH = "a4981f123a890df5f51fde8b6a6ab6134a04c38f0802af5904e8176dd7c7eeb5c5415366f56a86eda82e2e24b650ec157fa1d98b881d2acce94c8e9a8ccbe60c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fontPens \
python3.11dist-fontpens \
python311-fontPens \
python3dist-fontpens"

RDEPENDS:${PN} += "python-abi \
python311-FontTools"

inherit rpm
