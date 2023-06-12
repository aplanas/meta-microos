SUMMARY = "A script that recodes a spreadsheet's charset and saves as CSV"
DESCRIPTION = "This script will recode a spreadsheet into a different character set and output the recoded data as a csv file. \
The script came about after many headaches from dealing with Excel spreadsheets from clients that were being received in various character sets."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.07"

RPM_NAME = "xls2csv-1.07-1.20.noarch.rpm"
RPM_HASH = "39de193f77cae49a28385ebfe4f9fdfe4421364edfbe6b13d0097a5931ba4fe9d83d34dbf395696da7877140e226b5f483e6456cfa065637864ed108b0d6a8a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xls2csv"
RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl(Locale::Recode) \
perl(Spreadsheet::ParseExcel) \
perl(Spreadsheet::ParseExcel::FmtUnicode) \
perl(Text::CSV_XS) \
perl(Unicode::Map)"

inherit rpm
