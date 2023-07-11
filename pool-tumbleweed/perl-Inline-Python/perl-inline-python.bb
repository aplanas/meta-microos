SUMMARY = "Write Perl subs and classes in Python"
DESCRIPTION = "The 'Inline::Python' module allows you to put Python source code directly \
'inline' in a Perl script or module. It sets up an in-process Python \
interpreter, runs your code, and then examines Python's symbol table for \
things to bind to Perl. The process of interrogating the Python interpreter \
for globals only occurs the first time you run your Python code. The \
namespace is cached, and subsequent calls use the cached version. \
 \
This document describes 'Inline::Python', the Perl package which gives you \
access to a Python interpreter. For lack of a better place to keep it, it \
also gives you instructions on how to use 'perlmodule', the Python package \
which gives you access to the Perl interpreter."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.57"

RPM_NAME = "perl-Inline-Python-0.57-1.3.aarch64.rpm"
RPM_HASH = "71fa5b126cd1511c6f276e267d1cde798afb4b5b5c16c717246f82166aa333d81de3ae60461d849001151743d8788f960c8e5b288a3a52ef7a895235dac063b5"

RPROVIDES:${PN} += "perl-Inline--Python \
perl-Inline--Python--Boolean \
perl-Inline--Python--Function \
perl-Inline--Python--Object \
perl-Inline--Python--Object--Data \
perl-Inline-Python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
perl--MODULE-COMPAT-5.36.1 \
perl-Digest--MD5 \
perl-Inline"

inherit rpm
