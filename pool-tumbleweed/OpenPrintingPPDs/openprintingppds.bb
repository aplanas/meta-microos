SUMMARY = "PPD files from OpenPrinting.org"
DESCRIPTION = "To set up a printer configuration a printer description file \
(PPD file) is required. \
 \
A printer description file is not a driver. \
 \
For non-PostScript printers a driver is needed \
together with a PPD file which matches exactly \
to the particular driver. \
 \
For PostScript printers, a PPD file alone is sufficient \
(except for older PostScript level 1 printer models). \
 \
The PPD files are provided in the following sub-packages \
depending on which kind of driver software is needed: \
 \
OpenPrintingPPDs-ghostscript provides PPDs \
which use Ghostscript built-in drivers. \
 \
OpenPrintingPPDs-hpijs provides PPDs \
which use the hpijs driver from HPLIP. \
 \
OpenPrintingPPDs-postscript provides PPDs \
which need no driver."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "4.0.0.2"

RPM_NAME = "OpenPrintingPPDs-4.0.0.2-6.9.noarch.rpm"
RPM_HASH = "eda8506981244d9cf2f6a4f3a5bed0f856a37299211d41102381a70ffa6bb915c8912feacaf7a03901e6eb6d85214b9d5334ee453d49d4207ef9383b0a8137aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenPrintingPPDs"

RDEPENDS:${PN} += ""

inherit rpm
