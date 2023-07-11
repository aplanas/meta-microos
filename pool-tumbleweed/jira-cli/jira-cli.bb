SUMMARY = "CLI tool for Atlassian JIRA inspired by the Github CLI tool"
DESCRIPTION = "JiraCLI is an interactive command line tool for Atlassian Jira that will help \
you avoid Jira UI to some extent. This tool is not yet considered complete but \
has all the essential features required to improve your workflow with Jira. The \
tool started with the idea of making issue search and navigation as \
straightforward as possible. The tool now includes all necessary features like \
issue creation, cloning, linking, ticket transition, and much more. The TUI is \
heavily inspired by the GitHub CLI."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "jira-cli-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "7bd497ff70c5fd9968629cd782a7cdc1bf04427a42a8442d536d6655cb4ac263c0dcb3b9bdf2b6d379cd1d3b969c56eb3c632d312649869469bfb65e9a70b1ec"

RPROVIDES:${PN} += "jira-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
