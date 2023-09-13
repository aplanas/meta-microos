SUMMARY = "Config file reading, writing and validation"
DESCRIPTION = "ConfigObj is a simple but powerful config file reader and writer: an ini \
file round tripper. Its main feature is that it is very easy to use, with a \
straightforward programmer's interface and a simple syntax for config files. \
It has lots of other features though: \
 \
 * Nested sections (subsections), to any level \
 * List values \
 * Multiple line values \
 * Full Unicode support \
 * String interpolation (substitution) \
 * Integrated with a powerful validation system \
   - including automatic type checking/conversion \
   - and allowing default values \
   - repeated sections \
 * All comments in the file are preserved \
 * The order of keys/sections is preserved \
 * Powerful ``unrepr`` mode for storing/retrieving Python data-types"
LICENSE = "BSD-3-Clause"

PV = "5.0.8"

RPM_NAME = "python39-configobj-5.0.8-3.1.noarch.rpm"
RPM_HASH = "892424f8d86a103dd1d334fa67bf8eb2c331477b64c1658f70e843b28ff1d7206443cd504b5db84218584bce10fca653afacd827a625612c9b87af2d03eb5e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-configobj \
python39-configobj \
python3dist-configobj"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
