SUMMARY = "Binary files of pdfxup"
DESCRIPTION = "Binary files of pdfxup"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn40690"

RPM_NAME = "texlive-pdfxup-bin-2023.20230311.svn40690-93.2.aarch64.rpm"
RPM_HASH = "22efcdf86af0868f64a25305ec0cb615757d0fd83d3850682699e1a9e2e7a8ccd8958e8cdd7d2095a02665a6ad809f39f69f7ef5b4349cf4adc10af0b64bb662"

RPROVIDES:${PN} += "texlive-pdfxup-bin"

RDEPENDS:${PN} += "texlive-pdfxup"

inherit rpm
