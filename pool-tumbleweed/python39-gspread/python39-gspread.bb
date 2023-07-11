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

RPM_NAME = "python39-gspread-5.7.2-1.6.noarch.rpm"
RPM_HASH = "98ddc58ab352fb1c6f43b794720bb3b8e3423e4b16a7ad4ae7a067487d81c3083be8caba6d4a5726b79188d0e8c6fc900a88c8db8eb8560aef20dfbc5ca979c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gspread \
python39-gspread \
python3dist-gspread"

RDEPENDS:${PN} += "python-abi \
python39-google-auth \
python39-google-auth-oauthlib"

inherit rpm
