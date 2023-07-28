SUMMARY = "Edit file without entering the whole path"
DESCRIPTION = "This script uses slocate (or a similar application) to allow the user to open a \
file without having to enter a path. If multiple files are found the user is \
given the choice of which file to open. \
 \
Usage: \
  :LocateEdit somefile.txt \
  :LocateSplit somefile.txt \
  :LocateSource somefile.vim \
  :LocateRead somefile.txt"
LICENSE = "Vim"

PV = "1.3"

RPM_NAME = "vim-plugin-locateopen-1.3-56.1.noarch.rpm"
RPM_HASH = "2cc7410c8cd7866729ac233b99156259890a483b9eb153bbc4443fb4ac780b655d7f602f6a3c4a3ab7a7ff304a54c1229a9079945b0ae1666eb7705e86bf6d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-locateopen"

RDEPENDS:${PN} += "findutils-locate \
vim"

inherit rpm
