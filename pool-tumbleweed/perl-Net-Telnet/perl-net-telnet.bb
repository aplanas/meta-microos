SUMMARY = "Interact with TELNET port or other TCP ports"
DESCRIPTION = "Net::Telnet allows you to make client connections to a TCP port and do \
network I/O, especially to a port using the TELNET protocol. Simple I/O \
methods such as print, get, and getline are provided. More sophisticated \
interactive features are provided because connecting to a TELNET port \
ultimately means communicating with a program designed for human \
interaction. These interactive features include the ability to specify a \
time-out and to wait for patterns to appear in the input stream, such as \
the prompt from a shell. IPv6 support is available when using perl 5.14 or \
later, see 'family()'. \
 \
Other reasons to use this module than strictly with a TELNET port are: \
 \
  * You're not familiar with sockets and you want a simple way to make client \
connections to TCP services. \
 \
  * You want to be able to specify your own time-out while connecting, reading, \
or writing. \
 \
  * You're communicating with an interactive program at the other end of some \
socket or pipe and you want to wait for certain patterns to appear. \
 \
Here's an example that prints who's logged-on to a remote host. In addition \
to a username and password, you must also know the user's shell prompt, \
which for this example is ''bash$ '' \
 \
    use Net::Telnet (); \
    $t = new Net::Telnet (Timeout => 10, \
                          Prompt => '/bash\\$ $/'); \
    $t->open($host); \
    $t->login($username, $passwd); \
    @lines = $t->cmd('who'); \
    print @lines; \
 \
See the *EXAMPLES* section below for more examples. \
 \
Usage questions should be directed to the perlmonks.org discussion group. \
Bugs can be viewed or reported at cpan.org on the Net::Telnet page."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.05"

RPM_NAME = "perl-Net-Telnet-3.05-1.10.noarch.rpm"
RPM_HASH = "0d9f270f20918388c62032db81651faeffe57b914af3be8bd6dc6a38902d5efa1e8d72d3b10e08ceaf460226ed957a55054a161c98903bf974efaf5c773806f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Telnet \
perl-Net-Telnet"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
