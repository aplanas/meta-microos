SUMMARY = "Glob module recursive wildcards support"
DESCRIPTION = "This module provides an extended version of Python's builtin glob \
module with the following additions: \
 \
- The ability to capture the text matched by glob patterns, and \
  return those matches alongside the filenames. \
- A recursive '**' globbing syntax, akin for example to the globstar \
  option of the bash shell. \
- The ability to replace the filesystem functions used, in order to \
  glob on virtual filesystems."
LICENSE = "BSD-2-Clause"

PV = "0.7"

RPM_NAME = "python310-glob2-0.7-2.15.noarch.rpm"
RPM_HASH = "4e8e72c0188c331391b8eb07e886a90358c5ef32b01b99e8e685e40740f0cca8a7c50416bd410cb142d04ffa0c1e906aac82715c26feb830b075218b1722de05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-glob2 \
python310-glob2 \
python3dist-glob2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
