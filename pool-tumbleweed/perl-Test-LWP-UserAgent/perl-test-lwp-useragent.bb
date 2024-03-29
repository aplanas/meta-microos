SUMMARY = "LWP::UserAgent suitable for simulating and testing network calls"
DESCRIPTION = "This module is a subclass of LWP::UserAgent which overrides a few key \
low-level methods that are concerned with actually sending your request \
over the network, allowing an interception of that request and simulating a \
particular response. This greatly facilitates testing of networking client \
code where the server follows a known protocol. \
 \
The synopsis describes a typical case where you want to test how your \
application reacts to various responses from the server. This module will \
let you send back various responses depending on the request, without \
having to set up a real server to test against. This can be invaluable when \
you need to test edge cases or error conditions that are not normally \
returned from the server. \
 \
There are a lot of different ways you can set up the response mappings, and \
hook into this module; see the documentation for the individual interface \
methods. \
 \
You can use a PSGI app to handle the requests - see _examples/call_psgi.t_ \
in this distribution, and also register_psgi below. \
 \
OR, you can route some or all requests through the network as normal, but \
still gain the hooks provided by this class to test what was sent and \
received: \
 \
    my $useragent = Test::LWP::UserAgent->new(network_fallback => 1); \
 \
or: \
 \
    $useragent->map_network_response(qr/real.network.host/); \
 \
     \
 \
     \
    is( \
        $useragent->last_useragent->timeout, \
        180, \
        'timeout was overridden properly', \
    ); \
    is( \
        $useragent->last_http_request_sent->uri, \
        'uri my code should have constructed', \
    ); \
    is( \
        $useragent->last_http_response_received->code, \
        '200', \
        'I should have gotten an OK response', \
    );"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.036"

RPM_NAME = "perl-Test-LWP-UserAgent-0.036-1.9.noarch.rpm"
RPM_HASH = "9ea0b6fd496953c72cd32f520c6df9454163456e31b9e0e4f94d9e5c63d294c3298d070b6137acbe673a18d11f3e46367784516c5c65ea857e07059816cd01c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--LWP--UserAgent \
perl-Test-LWP-UserAgent"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Date \
perl-HTTP--Request \
perl-HTTP--Response \
perl-HTTP--Status \
perl-IO--Socket--IP \
perl-LWP--UserAgent \
perl-Safe--Isa \
perl-Try--Tiny \
perl-URI \
perl-namespace--clean \
perl-parent"

inherit rpm
