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

RPM_NAME = "perl-File-pushd-1.016-1.16.noarch.rpm"
RPM_HASH = "ed7ebf4e27a86515ccb555981136fb421410c7b3a80b947e95b19c0e35b482b304a0e00b1c6ef353ee10479aeea2671930edfb764b31a91292daa502a1422be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--pushd \
perl-File-pushd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
