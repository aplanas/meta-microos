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

RPM_NAME = "python39-configobj-5.0.8-1.1.noarch.rpm"
RPM_HASH = "3b97e09dc73363c51887100880baafaa4d17079259960eae292d2e5d095097656d4a35ed9e25d069e8692a28eeadc6dff30ab0d72a83091f73fd2bdf7c04d346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(configobj) \
python39-configobj \
python3dist(configobj)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
