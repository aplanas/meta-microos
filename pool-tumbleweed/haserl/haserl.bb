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

RPM_NAME = "haserl-0.9.36-1.10.aarch64.rpm"
RPM_HASH = "09a7812c5d1258086847ea5853a6949edb3bdbac72820c372682515e4044230c0e24fd49ff11a54c07de565467a32e8b61b78cfe9caefdd0650aa798a8364838"

RPROVIDES:${PN} += "haserl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5"

inherit rpm
