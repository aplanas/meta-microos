SUMMARY = "Google Spreadsheets Python API"
DESCRIPTION = "A Python module to access Google Spreadsheets. \
 \
Features \
-------- \
 \
* Google Sheets API v4. \
* Open a spreadsheet by its *title*, *url* or *key*. \
* Select cells by labels, e.g. 'A1'. \
* Extract range, entire row or column values. \
* Python 3 support."
LICENSE = "MIT"

PV = "5.7.2"

RPM_NAME = "python311-gspread-5.7.2-1.6.noarch.rpm"
RPM_HASH = "6815317790d8936b7336e125a1cd1cdefaa7e4a2f9fecef70497ded38f05c20a9e964be976ffedf858501f5b04fbf2803eca38cdc73f6ae360293bb85019be43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gspread \
python3.11dist-gspread \
python311-gspread \
python3dist-gspread"

RDEPENDS:${PN} += "python-abi \
python311-google-auth \
python311-google-auth-oauthlib"

inherit rpm
