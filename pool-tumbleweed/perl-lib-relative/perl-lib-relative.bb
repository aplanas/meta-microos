SUMMARY = "Add paths relative to the current file to @INC"
DESCRIPTION = "Adding a path to @INC to load modules from a local directory may seem \
simple, but has a few common pitfalls to be aware of. Directly adding a \
relative path to '@INC' means that any later code that changes the current \
working directory will change where modules are loaded from. This applies \
to the '.' path that used to be in '@INC' by default until perl 5.26.0, or \
a relative path added in code like 'use lib 'path/to/lib'', and may be a \
vulnerability if such a location is not supposed to be writable. \
Additionally, the commonly used FindBin module relies on interpreter state \
and the path to the original script invoked by the perl interpreter, \
sometimes requiring workarounds in uncommon cases like generated or \
embedded code. This module proposes a more straightforward method: take a \
path relative to the current file, absolutize it, and add it to '@INC'. \
 \
If this module is already available to be loaded, it can be used as with \
lib.pm, passing relative paths, which will be absolutized relative to the \
current file then passed on to lib. Multiple arguments will be separately \
absolutized, and absolute paths will be passed on unchanged. \
 \
For cases where this module cannot be loaded beforehand, the last section \
of the 'SYNOPSIS' can be copy-pasted into a file to perform the same task."
LICENSE = "Artistic-2.0"

PV = "1.2.0"

RPM_NAME = "perl-lib-relative-1.2.0-1.2.noarch.rpm"
RPM_HASH = "52e3b07da3658be2d3d4bb76af8b2536aca8cac73b6fbe379d1eb16d0052b668c21e63ea7a2a77468bc8dfab3cd9ecee40dd6c8dfe549d8978d730b8cbe7b433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-lib--relative \
perl-lib-relative"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
