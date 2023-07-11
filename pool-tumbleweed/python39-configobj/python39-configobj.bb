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

RPM_NAME = "python39-configobj-5.0.8-2.1.noarch.rpm"
RPM_HASH = "eaceb94f68b234c70d450e7bb33a22ea9d91a3c7a51ca07acc700652dce26c38933ba491dbe32920ca9042922c6935fef1f1a96f07540e4bce7ab1dceac132b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-configobj \
python39-configobj \
python3dist-configobj"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
