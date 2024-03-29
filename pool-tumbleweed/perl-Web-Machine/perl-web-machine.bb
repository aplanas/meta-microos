SUMMARY = "Perl port of Webmachine"
DESCRIPTION = "'Web::Machine' provides a RESTful web framework modeled as a state machine. \
You define one or more resource classes. Each resource represents a single \
RESTful URI end point, such as a user, an email, etc. The resource class \
can also be the target for 'POST' requests to create a new user, email, \
etc. \
 \
Each resource is a state machine, and each request for a resource is \
handled by running the request through that state machine. \
 \
'Web::Machine' is built on top of Plack, but it handles the full request \
and response cycle. \
 \
See Web::Machine::Manual for more details on using 'Web::Machine' in \
general, and how 'Web::Machine' and Plack interact. \
 \
This is a port of at https://github.com/basho/webmachine, actually it is \
much closer to the Ruby \
version|https://github.com/seancribbs/webmachine-ruby, with a little bit of \
at https://github.com/tautologistics/nodemachine and even some of at \
https://github.com/benoitc/pywebmachine thrown in for good measure. \
 \
You can learn a bit about Web::Machine's history from the slides for my \
2012 YAPC::NA \
talk|https://speakerdeck.com/stevan_little/rest-from-the-trenches. \
 \
To learn more about Webmachine, take a look at the links in the SEE ALSO \
section."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Web-Machine-0.17-2.11.noarch.rpm"
RPM_HASH = "aa522cbad616e9a7281430540f4adcd04cfa9bfa5a565bc7805b068b84a46b2399dcea56d07aff0f4d5eec37c3e91e4191d01e2206b905506ca9b90099413623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Web--Machine \
perl-Web--Machine--FSM \
perl-Web--Machine--FSM--States \
perl-Web--Machine--I18N \
perl-Web--Machine--I18N--en \
perl-Web--Machine--Resource \
perl-Web--Machine--Util \
perl-Web--Machine--Util--BodyEncoding \
perl-Web--Machine--Util--ContentNegotiation \
perl-Web-Machine"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Headers--ActionPack \
perl-HTTP--Status \
perl-Hash--MultiValue \
perl-IO--Handle--Util \
perl-Module--Runtime \
perl-Plack--Component \
perl-Plack--Request \
perl-Plack--Response \
perl-Plack--Util \
perl-Sub--Exporter \
perl-Try--Tiny \
perl-parent"

inherit rpm
