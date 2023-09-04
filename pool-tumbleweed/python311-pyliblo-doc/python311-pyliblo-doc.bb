SUMMARY = "Documentation for python-pyliblo"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python311-pyliblo-doc-0.10.0-3.1.aarch64.rpm"
RPM_HASH = "5ed7f22f51e589316f74773adf06efa228bfa5e1fd0ca08ed684d78233dabecab8fb223bc6e1b5351904b2f130339d06ac94236c0b669f6aeff4ebde9e7a7060"

RPROVIDES:${PN} += "python3-pyliblo-doc \
python311-pyliblo-doc"

RDEPENDS:${PN} += "python311-pyliblo"

inherit rpm
