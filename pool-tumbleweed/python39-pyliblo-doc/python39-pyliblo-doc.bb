SUMMARY = "Documentation for python-pyliblo"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python39-pyliblo-doc-0.10.0-2.11.aarch64.rpm"
RPM_HASH = "1754b06543f8074abab31ab2b9e93d877eb34bf6c0dce94016fc3695b5e5548a170c204ab5adcbd4a48f9bb3d1efdf35b9e0748855534af3bd0280c9fa308630"

RPROVIDES:${PN} += "python39-pyliblo-doc \
python39-pyliblo-doc(aarch-64)"

RDEPENDS:${PN} += "python39-pyliblo"

inherit rpm
