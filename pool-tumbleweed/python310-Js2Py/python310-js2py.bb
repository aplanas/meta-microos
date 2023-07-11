SUMMARY = "JavaScript to Python Translator & JavaScript interpreter"
DESCRIPTION = "Translates JavaScript to Python code. Js2Py is able to translate and \
execute virtually any JavaScript code. Js2Py, basically an \
implementation of the JavaScript core, is written in pure Python."
LICENSE = "MIT"

PV = "0.74"

RPM_NAME = "python310-Js2Py-0.74-2.2.noarch.rpm"
RPM_HASH = "81f677650cffa157973d11f7675580d27c5b8b0255e5d2a7dc90142e920cabae86bf5b2bfb31fff0361184742c61a2b37ebeb7a770a6e3108447c21eed77eaee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-js2py \
python310-Js2Py \
python3dist-js2py"

RDEPENDS:${PN} += "python-abi \
python310-pyjsparser \
python310-six \
python310-tzlocal"

inherit rpm
