SUMMARY = "Change Directory Temporarily for a Limited Scope"
DESCRIPTION = "File::pushd does a temporary 'chdir' that is easily and automatically \
reverted, similar to 'pushd' in some Unix command shells. It works by \
creating an object that caches the original working directory. When the \
object is destroyed, the destructor calls 'chdir' to revert to the original \
working directory. By storing the object in a lexical variable with a \
limited scope, this happens automatically at the end of the scope. \
 \
This is very handy when working with temporary directories for tasks like \
testing; a function is provided to streamline getting a temporary directory \
from File::Temp. \
 \
For convenience, the object stringifies as the canonical form of the \
absolute pathname of the directory entered. \
 \
*Warning*: if you create multiple 'pushd' objects in the same lexical \
scope, their destruction order is not guaranteed and you might not wind up \
in the directory you expect."
LICENSE = "Apache-2.0"

PV = "1.016"

RPM_NAME = "perl-File-pushd-1.016-1.18.noarch.rpm"
RPM_HASH = "01b910237626c8b477e71929dafd3ec287fe18a19fc3dfa763372129bb1517528b8ef18ef6b1de22d4ff35213d0331b8b6632eb8d1ab679a3f23b77f7990f17a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--pushd \
perl-File-pushd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
