SUMMARY = "A script that recodes a spreadsheet's charset and saves as CSV"
DESCRIPTION = "This script will recode a spreadsheet into a different character set and output the recoded data as a csv file. \
The script came about after many headaches from dealing with Excel spreadsheets from clients that were being received in various character sets."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.07"

RPM_NAME = "xls2csv-1.07-1.21.noarch.rpm"
RPM_HASH = "4b450ff978a86635e712a246a2572d0ba5c10090490de1a548080840ec1d4bd5530ab34472eb130fd7f8f93ededc2aa7f2049ac9000b5766d0a273c1dd18ba07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xls2csv"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Locale--Recode \
perl-Spreadsheet--ParseExcel \
perl-Spreadsheet--ParseExcel--FmtUnicode \
perl-Text--CSV-XS \
perl-Unicode--Map"

inherit rpm
