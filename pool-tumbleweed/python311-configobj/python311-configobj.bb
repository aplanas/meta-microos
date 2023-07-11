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

RPM_NAME = "python311-configobj-5.0.8-2.1.noarch.rpm"
RPM_HASH = "d113d288f0f33272da0c10588cac3dfc2d0dcda0c76001cb4817275cc71046915e6dc71927d062d9375c90043f6f09d6a6ccd8d08d9370864188e6795439bab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-configobj \
python3.11dist-configobj \
python311-configobj \
python3dist-configobj"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
