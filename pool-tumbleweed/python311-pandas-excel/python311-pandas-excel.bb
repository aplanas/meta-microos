SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-excel-2.0.2-4.1.noarch.rpm"
RPM_HASH = "d96240a00d5bf445f8df3c7abcb90e41761c8f67fcaffb1f32197aedbb88a64acb299a2c4b7adcfa02457502eedb3d4ef62bf75301850f1fd3912dbfa2aeff29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-excel \
python311-pandas-excel"

RDEPENDS:${PN} += "python311-XlsxWriter \
python311-odfpy \
python311-openpyxl \
python311-pandas \
python311-xlrd"

inherit rpm
