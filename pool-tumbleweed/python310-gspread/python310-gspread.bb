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

RPM_NAME = "python310-gspread-5.7.2-1.4.noarch.rpm"
RPM_HASH = "a43b9a1a9d8ab19a7812ebe63e707fb656adf9386b8332de4a1cd5d15e6bb1df826dd29d34372cabd975c996edc156ea72c99b4ba85fc167b4a96791b27c031e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gspread \
python3.10dist-gspread \
python310-gspread \
python3dist-gspread"

RDEPENDS:${PN} += "python-abi \
python310-google-auth \
python310-google-auth-oauthlib"

inherit rpm
