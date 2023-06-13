SUMMARY = "CGI scripting with shell/lua"
DESCRIPTION = "Haserl	is a small cgi wrapper that allows 'PHP' style cgi programming, \
but uses a UNIX bash-like shell or lua	as the programming language. It \
is  very  small,  so  it can be used in embedded environments, or where \
something like PHP is too big. \
 \
It combines three features into a small cgi engine: *  It parses \
   POST  and  GET  requests,  placing  form-elements  as name=value \
   pairs into the environment for the CGI script to use. This is \
   somewhat like the uncgi wrapper. \
 \
*  It opens a shell, and translates all text into printable \
   statements. All text within <? ... ?> constructs are passed \
   verbatim to the shell.  This is somewhat like writing PHP \
   scripts. \
 \
*  It can optionally be installed to drop its  permissions  to	the \
owner  of the script, giving it some of the security features of suexec \
or cgiwrapper."
LICENSE = "GPL-2.0"

PV = "0.9.36"

RPM_NAME = "haserl-0.9.36-1.9.aarch64.rpm"
RPM_HASH = "7ea5b4271c0780317ed2edc714610f03c1968b9b70388066f84edf2d52057a0b32d0b7b2b4b12906313003270481d9531c3a29e3c899812e15ea384cdf7b354b"

RPROVIDES:${PN} += "haserl \
haserl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblua5.4.so.5()(64bit)"

inherit rpm
