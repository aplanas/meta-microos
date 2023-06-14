SUMMARY = "A perl-specific System for writing Asynchronous web Apps"
DESCRIPTION = "CGI::Ajax is an object-oriented module that provides a unique mechanism for \
using perl code asynchronously from javascript- enhanced HTML pages. \
CGI::Ajax unburdens the user from having to write extensive javascript, \
except for associating an exported method with a document-defined event \
(such as onClick, onKeyUp, etc). CGI::Ajax also mixes well with HTML \
containing more complex javascript. \
 \
CGI::Ajax supports methods that return single results or multiple results \
to the web page, and supports returning values to multiple DIV elements on \
the HTML page. \
 \
Using CGI::Ajax, the URL for the HTTP GET/POST request is automatically \
generated based on HTML layout and events, and the page is then dynamically \
updated with the output from the perl function. Additionally, CGI::Ajax \
supports mapping URL's to a CGI::Ajax function name, so you can separate \
your code processing over multiple scripts. \
 \
Other than using the Class::Accessor module to generate CGI::Ajax' accessor \
methods, CGI::Ajax is completely self-contained - it does not require you \
to install a larger package or a full Content Management System, etc. \
 \
We have added _support_ for other CGI handler/decoder modules, like the \
CGI::Simple manpage or the CGI::Minimal manpage, but we can't test these \
since we run mod_perl2 only here. CGI::Ajax checks to see if a header() \
method is available to the CGI object, and then uses it. If method() isn't \
available, it creates it's own minimal header. \
 \
A primary goal of CGI::Ajax is to keep the module streamlined and maximally \
flexible. We are trying to keep the generated javascript code to a minimum, \
but still provide users with a variety of methods for deploying CGI::Ajax. \
And VERY little user javascript."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.707"

RPM_NAME = "perl-CGI-Ajax-0.707-15.26.noarch.rpm"
RPM_HASH = "8a2432e6c5ae3459a638f641a1978cc4b03e813a17d74d6ff8040bc565e906a17e33dfad882e718b595098d95769ed2cc1e9208cf824824b4dfab217c30eeb48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--Ajax \
perl-CGI-Ajax"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-CGI \
perl-Class--Accessor"

inherit rpm
