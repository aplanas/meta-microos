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

RPM_NAME = "python39-glob2-0.7-2.15.noarch.rpm"
RPM_HASH = "2dd2c6a5ae494f5f5ea742eaf40713d7acce4e831da92bbbfbf1b37d0d9cebac2be03608ba029e15d640a07984eaef6f6d1b6eb0a5591d597b0852a3ea353384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-glob2 \
python39-glob2 \
python3dist-glob2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
