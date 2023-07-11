SUMMARY = "A templating system for Python"
DESCRIPTION = "EmPy is a system for embedding Python expressions and statements \
in template text; it takes an EmPy source file, processes it, and \
produces output.  This is accomplished via expansions, which are \
special signals to the EmPy system and are set off by a special \
prefix (by default the at sign, '@').  EmPy can expand arbitrary \
Python expressions and statements in this way, as well as a \
variety of special forms.  Textual data not explicitly delimited \
in this way is sent unaffected to the output, allowing Python to \
be used in effect as a markup language.  Also supported are 'hook' \
callbacks, recording and playback via diversions, and dynamic, \
chainable filters.  The system is highly configurable via command \
line options and embedded commands."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.4"

RPM_NAME = "python39-empy-3.3.4-1.20.noarch.rpm"
RPM_HASH = "c95a865ea99bb16e2b6a46af57f59739842c164186a59e81a5f924070112d7bc7860726e9d41e2ccc1ea37e3b5bedae9a3ba477316ef4b035893d109287af549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-empy \
python39-empy \
python3dist-empy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
