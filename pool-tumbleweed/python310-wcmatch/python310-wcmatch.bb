SUMMARY = "Wildcard/glob file name matcher"
DESCRIPTION = "Wildcard Match provides an enhanced `fnmatch`, `glob`, and `pathlib` library in order to provide file matching and \
globbing that more closely follows the features found in Bash. In some ways these libraries are similar to Python's \
builtin libraries as they provide a similar interface to match, filter, and glob the file system. But they also include \
a number of features found in Bash's globbing such as backslash escaping, brace expansion, extended glob pattern groups, \
etc. They also add a number of new useful functions as well, such as `globmatch` which functions like `fnmatch`, but for \
paths. \
 \
Wildcard Match also adds a file search utility called `wcmatch` that is built on top of `fnmatch` and `globmatch`. It \
was originally written for [Rummage](https://github.com/facelessuser/Rummage), but split out into this project to be \
used by other projects that may find its approach useful. \
 \
Bash is used as a guide when making decisions on behavior for `fnmatch` and `glob`. Behavior may differ from Bash \
version to Bash version, but an attempt is made to keep Wildcard Match up with the latest relevant changes. With all of \
this said, there may be a few corner cases in which we've intentionally chosen to not *exactly* mirror Bash. If an issue \
is found where Wildcard Match seems to deviate in an illogical way, we'd love to hear about it in the \
[issue tracker](https://github.com/facelessuser/wcmatch/issues)."
LICENSE = "MIT"

PV = "8.4.1"

RPM_NAME = "python310-wcmatch-8.4.1-2.3.noarch.rpm"
RPM_HASH = "ce0a55f00329a2180a55405179ec899331425c465ab781e4a783fe3c3ced6dc8b3c6910e121c28a47a33c13e919a5b904c9fdf846f5922a2a05fb4efeb583cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wcmatch \
python310-wcmatch \
python3dist-wcmatch"

RDEPENDS:${PN} += "python-abi \
python3.10dist-bracex"

inherit rpm
