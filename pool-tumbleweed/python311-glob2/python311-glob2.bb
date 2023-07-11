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

RPM_NAME = "python311-glob2-0.7-2.15.noarch.rpm"
RPM_HASH = "85807b96024820865d0023acf9818113351fb252662aa17997dd0b847c82d4a8ee15047d1090528198074b6094553834921e3c4b4821d400bcf58f0a8cfbb906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glob2 \
python3.11dist-glob2 \
python311-glob2 \
python3dist-glob2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
