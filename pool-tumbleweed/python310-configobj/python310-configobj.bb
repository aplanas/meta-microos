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

RPM_NAME = "python310-configobj-5.0.8-1.1.noarch.rpm"
RPM_HASH = "038dbd1e67eaac54aba12690cd0b11b94425f9ba612a5e292ab8f7edb913d14ac899a33705c64c47dda6163a6af5748d8327444ee27049c0eaea8d013176f62d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-configobj \
python3.10dist(configobj) \
python310-configobj \
python3dist(configobj)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
