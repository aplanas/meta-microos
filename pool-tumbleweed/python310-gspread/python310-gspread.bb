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

RPM_NAME = "python310-gspread-5.7.2-1.6.noarch.rpm"
RPM_HASH = "a31f253ad962a30c6de4ba95e5ee79c69683a5dad546c8b386132d4119044cd933a53d52137e519562c2809f4ae406bae18957426173b722ad17f81e8c8629a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gspread \
python310-gspread \
python3dist-gspread"

RDEPENDS:${PN} += "python-abi \
python310-google-auth \
python310-google-auth-oauthlib"

inherit rpm
