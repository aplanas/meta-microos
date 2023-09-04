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

RPM_NAME = "perl-Inline-Python-0.57-1.4.aarch64.rpm"
RPM_HASH = "5ceec3a4b8292f7b4645b8b718f1f6a573aee9e58832d4bf7f54da0ea6761529b5611c51270294df15069efc629bfc43b67d6edb3ef30dbb9f4e1d4d3cde944a"

RPROVIDES:${PN} += "perl-Inline--Python \
perl-Inline--Python--Boolean \
perl-Inline--Python--Function \
perl-Inline--Python--Object \
perl-Inline--Python--Object--Data \
perl-Inline-Python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
perl--MODULE-COMPAT-5.38.0 \
perl-Digest--MD5 \
perl-Inline"

inherit rpm
