SUMMARY = "JavaScript to Python Translator & JavaScript interpreter"
DESCRIPTION = "Translates JavaScript to Python code. Js2Py is able to translate and \
execute virtually any JavaScript code. Js2Py, basically an \
implementation of the JavaScript core, is written in pure Python."
LICENSE = "MIT"

PV = "0.74"

RPM_NAME = "python39-Js2Py-0.74-2.2.noarch.rpm"
RPM_HASH = "b7642c29f8ba5b0d5df180e48d31ce9283d15f773fec3bf440729d1f27cd3cef53d4257613d426b1900ecaeaeb8be023386b2aadc291eeaa6d3eda178d089be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-js2py \
python39-Js2Py \
python3dist-js2py"

RDEPENDS:${PN} += "python-abi \
python39-pyjsparser \
python39-six \
python39-tzlocal"

inherit rpm
