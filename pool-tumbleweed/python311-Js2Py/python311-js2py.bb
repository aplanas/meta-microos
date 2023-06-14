SUMMARY = "JavaScript to Python Translator & JavaScript interpreter"
DESCRIPTION = "Translates JavaScript to Python code. Js2Py is able to translate and \
execute virtually any JavaScript code. Js2Py, basically an \
implementation of the JavaScript core, is written in pure Python."
LICENSE = "MIT"

PV = "0.74"

RPM_NAME = "python311-Js2Py-0.74-2.1.noarch.rpm"
RPM_HASH = "443b0fc9233c799219902778229a92954b661e157d464e3fe4db8ac999f1c37d9a1bf85390c45b458adaa02884fbc60394ff58719901d5f8d4ecaddb8b356a45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-js2py \
python311-Js2Py \
python3dist-js2py"

RDEPENDS:${PN} += "python-abi \
python311-pyjsparser \
python311-six \
python311-tzlocal"

inherit rpm
