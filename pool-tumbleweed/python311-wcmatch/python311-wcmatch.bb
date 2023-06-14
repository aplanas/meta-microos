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

RPM_NAME = "python311-wcmatch-8.4.1-2.1.noarch.rpm"
RPM_HASH = "8559e9d0fd1f1b29a9968f0f4bdf56249f868c2289976328d94d7bd8c81897b7754ee7ccc74d1c2e50717a5c954c9f2fcfa0cd210f2a93b2981719f2183985fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-wcmatch \
python311-wcmatch \
python3dist-wcmatch"

RDEPENDS:${PN} += "python-abi \
python3.11dist-bracex"

inherit rpm
