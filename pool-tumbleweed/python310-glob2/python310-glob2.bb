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

RPM_NAME = "python310-glob2-0.7-2.13.noarch.rpm"
RPM_HASH = "92489477165a51ec0eae9a6bbb11867c73fcc62004cfd9f4d863f46eb17b074ff67bad67b7295cf977abd835151d140e5b0f989f406f0ba00371bc20776446b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glob2 \
python3.10dist(glob2) \
python310-glob2 \
python3dist(glob2)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
