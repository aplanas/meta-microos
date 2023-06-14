SUMMARY = "Framework for Running Test Suites on Software Tools"
DESCRIPTION = "DejaGnu is a framework for testing other programs.  Its purpose is to \
provide a single front-end for all tests.  Beyond this, DejaGnu offers \
several advantages for testing: \
 \
1. The flexibility and consistency of the DejaGnu framework make it \
   easy to write tests for any program. \
 \
1. DejaGnu provides a layer of abstraction that allows you to write \
   tests that are portable to any host or target where a program \
   must be tested.  For instance, a test for GDB can run (from any \
   Unix-based host) on any target architecture that DejaGnu \
   supports. \
 \
1. All tests have the same output format.  This makes it easy to \
   integrate testing into other software development processes. \
   DejaGnu's output is designed to be parsed by other filtering \
   scripts and it is also human-readable. \
 \
DejaGnu is written in expect, which in turn uses 'Tcl'--Tool command \
language. \
 \
Running tests requires two things: the testing framework and the test \
suites themselves."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.3"

RPM_NAME = "dejagnu-1.6.3-1.13.noarch.rpm"
RPM_HASH = "e0cf6a8c4d64753e07d68650bc2ef7589c02e02fbb4f3bec296d14ca24613259c3bde8e47b7bd48bc1f73fdfbfa8ccdcb532d75db27bec14a3ac820e862a6893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dejagnu \
dejagnu"

RDEPENDS:${PN} += "/bin/sh \
expect \
info \
tcl"

inherit rpm
