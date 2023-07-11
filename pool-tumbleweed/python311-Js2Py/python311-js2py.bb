SUMMARY = "JavaScript to Python Translator & JavaScript interpreter"
DESCRIPTION = "Translates JavaScript to Python code. Js2Py is able to translate and \
execute virtually any JavaScript code. Js2Py, basically an \
implementation of the JavaScript core, is written in pure Python."
LICENSE = "MIT"

PV = "0.74"

RPM_NAME = "python311-Js2Py-0.74-2.2.noarch.rpm"
RPM_HASH = "957c32e34d67d8f91bf7461335768b2e0e0e1c6f45b913a2f2a35edd82463061e11a8b0013a1bea2730701cffaae23a6b5173bfd295e8ea95f6a73094bfd0fa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Js2Py \
python3.11dist-js2py \
python311-Js2Py \
python3dist-js2py"

RDEPENDS:${PN} += "python-abi \
python311-pyjsparser \
python311-six \
python311-tzlocal"

inherit rpm
