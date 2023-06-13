SUMMARY = "JavaScript to Python Translator & JavaScript interpreter"
DESCRIPTION = "Translates JavaScript to Python code. Js2Py is able to translate and \
execute virtually any JavaScript code. Js2Py, basically an \
implementation of the JavaScript core, is written in pure Python."
LICENSE = "MIT"

PV = "0.74"

RPM_NAME = "python310-Js2Py-0.74-2.1.noarch.rpm"
RPM_HASH = "924b986bfa44c5f68deed936c4f2de01d6918c3ded039da5bc0bccc39f8db68810eaf56e3a42f39e7aa0bc1ee676fdeec3c240368044c7af183ae693620783b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Js2Py \
python3.10dist(js2py) \
python310-Js2Py \
python3dist(js2py)"

RDEPENDS:${PN} += "python(abi) \
python310-pyjsparser \
python310-six \
python310-tzlocal"

inherit rpm
